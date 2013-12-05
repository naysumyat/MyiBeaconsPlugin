var iBeacon = {
    verifyBluetooth: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'IBeaconsPlugins',
            'verifyBluetooth',
            [{
                
            }]
        );
    }
}
module.exports = iBeacon;