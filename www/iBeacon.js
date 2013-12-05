var iBeacon = {
    verifyBluetooth: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'iBeacon',
            'verifyBluetooth',
            [{
                
            }]
        );
    }
}
module.exports = iBeacon;