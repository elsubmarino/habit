const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');
const isProd = process.env.NODE_ENV === 'production'

const config = {
    entry: {
        index: path.resolve(__dirname, 'src/index.js'),
        login:'./assets/js/login/login.jsx'
    },
    output: {
        path: path.resolve(__dirname, 'src/main/frontend/assets/out'),
        publicPath: '/assets',
        //filename: '[name]-[hash].js',
        filename: '[name].js',
        //filename: '../resources/static/[name]-[hash].js',
        //chunkFilename: 'chunk-[chunkhash].js',
        chunkFilename: '[name].js',
        //chunkFilename: '../resources/static/[name]-[chunkhash].js',
    },
    module: {
        rules: [
            {
                test: /\.(js|jsx)$/,
                exclude: [path.resolve(__dirname, 'node_modules')],
                use: {
                    loader: "babel-loader",
                    options:{
                        presets:[
                            "@babel/preset-env",
                            "@babel/preset-react"
                        ]
                    }
                }
            },
            {
                test: /\.css$/,
                use: ["style-loader", "css-loader"],
            },
            {
                test: /\.(png|svg|jpe?g|gif)$/,
                loader:'file-loader'
            }
        ]
    },
    plugins: [
        new CleanWebpackPlugin({cleanAfterEveryBuildPatterns: ['public']}),
        new HtmlWebpackPlugin({
            minify: isProd
                ? true
                : {
                    collapseWhitespace: true,
                    removeComments: true,
                    useShortDoctype: true,
                    minifyCSS: true,
                },
            //template: './static/index.html',
            template: '../resources/templates/index.html',
            title: 'Spring Boot + React.js',
            description: `Spring Boot + React.js Example`,
            url: 'https://ohjongsung.io',
        })
    ],
};

module.exports = config