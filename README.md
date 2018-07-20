# Cordova Wifi Switch Plugin

A plugin of switching on and off Wifi.

## Using
    
Install the plugin

    $ cordova plugin add https://github.com/BingoJYB/Cordova-Plugin-Wifi-Switch.git
    

Add the following code

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error");
    }

    cordova.plugins.wifiswitch.switch(true, success, failure);
    
    or
    
    cordova.plugins.wifiswitch.switch(false, success, failure);
```

Install Android platform

    cordova platform add android
    
Run the code

    cordova run
