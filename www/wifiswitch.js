var exec = require('cordova/exec');

module.exports = {
    switch: function (state, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "WifiSwitch", "setWifiEnabled", [state]);
    },

    isWifiEnabled: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "WifiSwitch", "isWifiEnabled", []);
    }
};
