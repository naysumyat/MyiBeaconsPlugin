var ibeacon = {
    verifyBluetooth: function (successCallback, errorCallback) {
        cordova.exec(
            successCallback,
            errorCallback,
            'IBeacon',
            'verifyBluetooth',
            [{

            }]
        );
    }
}
module.exports = ibeacon;
