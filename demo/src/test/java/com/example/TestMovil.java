package com.example;

import java.net.MalformedURLException; // importar la librería de MalformedURLException porque es la encargada de manejar los errores de URL
import java.net.URL; // importar la librería de URL porque es la encargada de manejar las URL
import java.util.concurrent.TimeUnit; // importar la librería de TimeUnit porque es la encargada de manejar los tiempos

import org.junit.Test; // importar la librería de Test porque es la encargada de manejar los test
import org.openqa.selenium.remote.DesiredCapabilities; // importar la librería de DesiredCapabilities porque es la encargada de manejar las capacidades deseadas

import io.appium.java_client.MobileElement; // importar la librería de MobileElement porque es la encargada de manejar los elementos móviles
import io.appium.java_client.android.AndroidDriver;  // importar la librería de AndroidDriver porque es la encargada de manejar los drivers de Android

public class TestMovil { // crear la clase TestMovil
    @Test // crear el método TestMovil
    public void main() throws MalformedURLException { // crear el método main
        AndroidDriver<MobileElement> driverAndroid;  // crear el driver de Android para manejar los elementos móviles
        System.out.println("creación del driver");  // imprimir en consola el mensaje "creación del driver" por  consola

        DesiredCapabilities capabilities = new DesiredCapabilities(); //DesiredCapabilities es la clase que maneja las capacidades deseadas
        
        capabilities.setCapability("platformName", "Android"); //capabilities es el objeto que maneja las capacidades deseadas
        capabilities.setCapability("platformVersion", "11"); //setCapability para asignar la capacidad deseada
        capabilities.setCapability("appActivity", ""); //llamamos la appActivity de la app que queremos probar
        capabilities.setCapability("appPackage", "");  //llamamos la appPackage de la app que queremos probar

        driverAndroid = new AndroidDriver<MobileElement>(new URL( "http://localhost:4723/wd/hub"), capabilities); //creamos el driver de Android para manejar los elementos móviles usando la URL y las capacidades deseadas con la ayuda de appium
        driverAndroid.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); //timeouts para manejar los tiempos de espera de los elementos móviles
    }
}
