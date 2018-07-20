# Cordova Wifi Switch Plugin

A plugin of switching on and off Wifi.

## Using
    
Install the plugin

    $ cordova plugin add https://github.com/don/cordova-plugin-hello.git
    

Edit `www/js/index.js` and add the following code inside `onDeviceReady`

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error");
    }

    cordova.plugins.wifiswitch.switch(true, success, failure);
```

Install Android platform

    cordova platform add android
    
Run the code

    cordova run