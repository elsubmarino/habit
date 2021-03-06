const { merge } = require('webpack-merge')
const common = require('./webpack.common.js')
const path = require('path')

const config =  {
    mode: 'development',
    devtool: 'inline-source-map',
    devServer: {
        contentBase: path.resolve(__dirname, 'public'),
        historyApiFallback: true,
        compress: true,
        open: true,
        port: 3000,
        host: 'localhost',
        // dev 환경에서 cors 대응
        proxy: {
            '**': 'http://localhost:8080',
        }
    },
}

module.exports = merge(common, config)