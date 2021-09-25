const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const { CleanWebpackPlugin } = require('clean-webpack-plugin');
const isProd = process.env.NODE_ENV === 'production'
const webpack = require("webpack");
const dotenv = require("dotenv");
dotenv.config();

const config = {
    entry: {
        index: path.resolve(__dirname, 'assets/js/index.tsx'),
        login2:'./assets/js/login/login.tsx',
        habit:'./assets/js/habit/habit.tsx',
        regist:'./assets/js/login/regist.tsx',
        maps:'./assets/js/map/maps.tsx',
    },
    resolve: {
        extensions: ['.jsx', '.js', '.json', '.ts','.tsx','.css','.scss']
    },
    output: {
        path: path.resolve(__dirname, 'assets/out'),
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
                test: /\.(ts|tsx)$/,
                exclude: [path.resolve(__dirname, 'node_modules')],
                use: [
                    'babel-loader',
                    {
                        loader: 'ts-loader',
                        options: {
                            transpileOnly: true,
                        },
                    },
                ],
                // use: {
                //     loader: "babel-loader",
                //     options:{
                //         presets:[
                //             "@babel/preset-env",
                //             "@babel/preset-react"
                //         ]
                //     }
                // }
            },
            // {
            //     test: /\.(ts|tsx)$/,
            //     loader: 'ts-loader',
            //     // include: [path.resolve(__dirname, 'yourAppPath')],
            //     exclude: [path.resolve(__dirname, 'node_modules')],
            // },
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
        }),
        new webpack.DefinePlugin({
            "process.env":JSON.stringify(process.env),
        })
    ],
};

module.exports = config