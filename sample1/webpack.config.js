const path = require('path');
const CleanWebpackPlugin = require('clean-webpack-plugin');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const production = process.argv.indexOf('-p') >= 0;

module.exports = {
  mode: production ? 'production' : 'development',

  entry: {
    'application': [
      'sample1'
    ]
  },

  output: {
    filename: '[name].[hash].js',
    chunkFilename: '[name].[hash].js',
    path: path.resolve('./dist/')
  },

  resolve: {
    modules: [
      path.resolve('./build/kotlin-js-min/main'),
      'node_modules'
    ]
  },

  plugins: [
    new CleanWebpackPlugin([
      path.resolve('./dist')
    ]),
    new HtmlWebpackPlugin()
  ],

  devServer: {
    port: 5000
  }
};
