/*
 * Copyright (c) 1996, 2011, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */
package sun.applet.resources;

import java.util.ListResourceBundle;

public class MsgAppletViewer_es extends ListResourceBundle {

    public Object[][] getContents() {
        Object[][] temp = new Object[][] { { "textframe.button.dismiss", "Descartar" },
            { "appletviewer.tool.title", "Visor de Applet: {0}" }, { "appletviewer.menu.applet", "Applet" },
            { "appletviewer.menuitem.restart", "Reiniciar" }, { "appletviewer.menuitem.reload", "Volver a Cargar" },
            { "appletviewer.menuitem.stop", "Parar" }, { "appletviewer.menuitem.save", "Guardar..." },
            { "appletviewer.menuitem.start", "Iniciar" }, { "appletviewer.menuitem.clone", "Clonar..." },
            { "appletviewer.menuitem.tag", "Etiqueta..." }, { "appletviewer.menuitem.info", "Informaci\u00F3n..." },
            { "appletviewer.menuitem.edit", "Editar" },
            { "appletviewer.menuitem.encoding", "Codificaci\u00F3n de Caracteres" },
            { "appletviewer.menuitem.print", "Imprimir..." }, { "appletviewer.menuitem.props", "Propiedades..." },
            { "appletviewer.menuitem.close", "Cerrar" }, { "appletviewer.menuitem.quit", "Salir" },
            { "appletviewer.label.hello", "Hola..." }, { "appletviewer.status.start", "iniciando applet..." },
            { "appletviewer.appletsave.filedialogtitle", "Serializar Applet en Archivo" },
            { "appletviewer.appletsave.err1", "serializando {0} en {1}" },
            { "appletviewer.appletsave.err2", "en appletSave: {0}" }, { "appletviewer.applettag", "Etiqueta Mostrada" },
            { "appletviewer.applettag.textframe", "Etiqueta HTML de Applet" },
            { "appletviewer.appletinfo.applet", "-- ninguna informaci\u00F3n de applet --" },
            { "appletviewer.appletinfo.param", "-- ninguna informaci\u00F3n de par\u00E1metros --" },
            { "appletviewer.appletinfo.textframe", "Informaci\u00F3n del Applet" },
            { "appletviewer.appletprint.fail", "Fallo de impresi\u00F3n." },
            { "appletviewer.appletprint.finish", "Impresi\u00F3n terminada." },
            { "appletviewer.appletprint.cancel", "Impresi\u00F3n cancelada." },
            { "appletviewer.appletencoding", "Codificaci\u00F3n de Caracteres: {0}" },
            { "appletviewer.parse.warning.requiresname",
                "Advertencia: la etiqueta <param name=... value=...> requiere un atributo name." },
            { "appletviewer.parse.warning.paramoutside",
                "Advertencia: la etiqueta <param> est\u00E1 fuera de <applet> ... </applet>." },
            { "appletviewer.parse.warning.applet.requirescode",
                "Advertencia: la etiqueta <applet> requiere el atributo code." },
            { "appletviewer.parse.warning.applet.requiresheight",
                "Advertencia: la etiqueta <applet> requiere el atributo height." },
            { "appletviewer.parse.warning.applet.requireswidth",
                "Advertencia: la etiqueta <applet> requiere el atributo width." },
            { "appletviewer.parse.warning.object.requirescode",
                "Advertencia: la etiqueta <object> requiere el atributo code." },
            { "appletviewer.parse.warning.object.requiresheight",
                "Advertencia: la etiqueta <object> requiere el atributo height." },
            { "appletviewer.parse.warning.object.requireswidth",
                "Advertencia: la etiqueta <object> requiere el atributo width." },
            { "appletviewer.parse.warning.embed.requirescode",
                "Advertencia: la etiqueta <embed> requiere el atributo code." },
            { "appletviewer.parse.warning.embed.requiresheight",
                "Advertencia: la etiqueta <embed> requiere el atributo height." },
            { "appletviewer.parse.warning.embed.requireswidth",
                "Advertencia: la etiqueta <embed> requiere el atributo width." },
            { "appletviewer.parse.warning.appnotLongersupported",
                "Advertencia: la etiqueta <app> ya no est\u00E1 soportada, utilice <applet> en su lugar:" },
            { "appletviewer.usage",
                "Sintaxis: appletviewer <opciones> url(s)\n\ndonde <opciones> incluye:\n  -debug                  Iniciar el visor de applet en el depurador Java\n  -encoding <codificaci\u00F3n>    Especificar la codificaci\u00F3n de caracteres utilizada por los archivos HTML\n  -J<indicador de tiempo de ejecuci\u00F3n>        Transferir argumento al int\u00E9rprete de Java\n\nLa opci\u00F3n -J es no est\u00E1ndar y est\u00E1 sujeta a cambios sin previo aviso." },
            { "appletviewer.main.err.unsupportedopt", "Opci\u00F3n no soportada: {0}" },
            { "appletviewer.main.err.unrecognizedarg", "Argumento no reconocido: {0}" },
            { "appletviewer.main.err.dupoption", "Uso duplicado de la opci\u00F3n: {0}" },
            { "appletviewer.main.err.inputfile", "No se ha especificado ning\u00FAn archivo de entrada." },
            { "appletviewer.main.err.badurl", "URL Err\u00F3nea: {0} ( {1} )" },
            { "appletviewer.main.err.io", "Excepci\u00F3n de E/S durante la lectura: {0}" },
            { "appletviewer.main.err.readablefile", "Aseg\u00FArese de que {0} es un archivo y que se puede leer." },
            { "appletviewer.main.err.correcturl", "\u00BFEs {0} la URL correcta?" },
            { "appletviewer.main.prop.store", "Propiedades Espec\u00EDficas del Usuario para AppletViewer" },
            { "appletviewer.main.err.prop.cantread", "No se puede leer el archivo de propiedades del usuario: {0}" },
            { "appletviewer.main.err.prop.cantsave", "No se puede guardar el archivo de propiedades del usuario: {0}" },
            { "appletviewer.main.warn.nosecmgr", "Advertencia: desactivando seguridad." },
            { "appletviewer.main.debug.cantfinddebug", "No se ha encontrado el depurador." },
            { "appletviewer.main.debug.cantfindmain", "No se ha encontrado el m\u00E9todo principal en el depurador." },
            { "appletviewer.main.debug.exceptionindebug", "Excepci\u00F3n en el depurador." },
            { "appletviewer.main.debug.cantaccess", "No se puede acceder al depurador." },
            { "appletviewer.main.nosecmgr", "Advertencia: no se ha instalado SecurityManager." },
            { "appletviewer.main.warning",
                "Advertencia: no se ha iniciado ning\u00FAn applet. Aseg\u00FArese de que la entrada contiene una etiqueta <applet>." },
            { "appletviewer.main.warn.prop.overwrite",
                "Advertencia: se sobrescribir\u00E1 temporalmente la propiedad del sistema cuando lo solicite el usuario: clave: {0} valor anterior: {1} nuevo valor: {2}" },
            { "appletviewer.main.warn.cantreadprops",
                "Advertencia: no se puede leer el archivo de propiedades de AppletViewer: {0}. Utilizando valores por defecto." },
            { "appletioexception.loadclass.throw.interrupted", "carga de clase interrumpida: {0}" },
            { "appletioexception.loadclass.throw.notloaded", "clase no cargada: {0}" },
            { "appletclassloader.loadcode.verbose", "Abriendo flujo a: {0} para obtener {1}" },
            { "appletclassloader.filenotfound", "No se ha encontrado el archivo al buscar: {0}" },
            { "appletclassloader.fileformat", "Excepci\u00F3n de formato de archivo al cargar: {0}" },
            { "appletclassloader.fileioexception", "Excepci\u00F3n de E/S al cargar: {0}" },
            { "appletclassloader.fileexception", "Excepci\u00F3n de {0} al cargar: {1}" },
            { "appletclassloader.filedeath", "{0} interrumpido al cargar: {1}" },
            { "appletclassloader.fileerror", "error de {0} al cargar: {1}" },
            { "appletclassloader.findclass.verbose.openstream", "Abriendo flujo a: {0} para obtener {1}" },
            { "appletclassloader.getresource.verbose.forname", "AppletClassLoader.getResource para nombre: {0}" },
            { "appletclassloader.getresource.verbose.found", "Recurso encontrado: {0} como un recurso de sistema" },
            { "appletclassloader.getresourceasstream.verbose", "Recurso encontrado: {0} como un recurso de sistema" },
            { "appletpanel.runloader.err", "Par\u00E1metro de c\u00F3digo u objeto." },
            { "appletpanel.runloader.exception", "excepci\u00F3n al deserializar {0}" },
            { "appletpanel.destroyed", "Applet destruido." }, { "appletpanel.loaded", "Applet cargado." },
            { "appletpanel.started", "Applet iniciado." }, { "appletpanel.inited", "Applet inicializado." },
            { "appletpanel.stopped", "Applet parado." }, { "appletpanel.disposed", "Applet desechado." },
            { "appletpanel.nocode", "Falta el par\u00E1metro CODE en la etiqueta APPLET." },
            { "appletpanel.notfound", "cargar: clase {0} no encontrada." },
            { "appletpanel.nocreate", "cargar: {0} no se puede instanciar." },
            { "appletpanel.noconstruct", "cargar: {0} no es p\u00FAblico o no tiene un constructor p\u00FAblico." },
            { "appletpanel.death", "interrumpido" }, { "appletpanel.exception", "excepci\u00F3n: {0}." },
            { "appletpanel.exception2", "excepci\u00F3n: {0}: {1}." }, { "appletpanel.error", "error: {0}." },
            { "appletpanel.error2", "error: {0}: {1}." },
            { "appletpanel.notloaded", "Iniciaci\u00F3n: applet no cargado." },
            { "appletpanel.notinited", "Iniciar: applet no inicializado." },
            { "appletpanel.notstarted", "Parar: applet no iniciado." },
            { "appletpanel.notstopped", "Destruir: applet no parado." },
            { "appletpanel.notdestroyed", "Desechar: applet no destruido." },
            { "appletpanel.notdisposed", "Cargar: applet no desechado." },
            { "appletpanel.bail", "Interrumpido: rescatando." },
            { "appletpanel.filenotfound", "No se ha encontrado el archivo al buscar: {0}" },
            { "appletpanel.fileformat", "Excepci\u00F3n de formato de archivo al cargar: {0}" },
            { "appletpanel.fileioexception", "Excepci\u00F3n de E/S al cargar: {0}" },
            { "appletpanel.fileexception", "Excepci\u00F3n de {0} al cargar: {1}" },
            { "appletpanel.filedeath", "{0} interrumpido al cargar: {1}" },
            { "appletpanel.fileerror", "error de {0} al cargar: {1}" }, { "appletpanel.badattribute.exception",
            "An\u00E1lisis HTML: valor incorrecto para el atributo width/height." },
            { "appletillegalargumentexception.objectinputstream",
                "AppletObjectInputStream requiere un cargador no nulo" },
            { "appletprops.title", "Propiedades de AppletViewer" },
            { "appletprops.label.http.server", "Servidor Proxy HTTP:" },
            { "appletprops.label.http.proxy", "Puerto Proxy HTTP:" }, { "appletprops.label.network", "Acceso de Red:" },
            { "appletprops.choice.network.item.none", "Ninguno" },
            { "appletprops.choice.network.item.applethost", "Host del Applet" },
            { "appletprops.choice.network.item.unrestricted", "No Restringido" },
            { "appletprops.label.class", "Acceso de Clase:" },
            { "appletprops.choice.class.item.restricted", "Restringido" },
            { "appletprops.choice.class.item.unrestricted", "No Restringido" },
            { "appletprops.label.unsignedapplet", "Permitir Applets no Firmados:" },
            { "appletprops.choice.unsignedapplet.no", "No" }, { "appletprops.choice.unsignedapplet.yes", "S\u00ED" },
            { "appletprops.button.apply", "Aplicar" }, { "appletprops.button.cancel", "Cancelar" },
            { "appletprops.button.reset", "Restablecer" },
            { "appletprops.apply.exception", "Fallo al guardar las propiedades: {0}" },
            /* 4066432 */
            { "appletprops.title.invalidproxy", "Entrada no V\u00E1lida" },
            { "appletprops.label.invalidproxy", "El puerto proxy debe ser un valor entero positivo." },
            { "appletprops.button.ok", "Aceptar" },
            /* end 4066432 */
            { "appletprops.prop.store", "Propiedades espec\u00EDficas del usuario para AppletViewer" },
            { "appletsecurityexception.checkcreateclassloader", "Excepci\u00F3n de Seguridad: classloader" },
            { "appletsecurityexception.checkaccess.thread", "Excepci\u00F3n de Seguridad: thread" },
            { "appletsecurityexception.checkaccess.threadgroup", "Excepci\u00F3n de Seguridad: threadgroup: {0}" },
            { "appletsecurityexception.checkexit", "Excepci\u00F3n de Seguridad: salir: {0}" },
            { "appletsecurityexception.checkexec", "Excepci\u00F3n de Seguridad: ejecutar: {0}" },
            { "appletsecurityexception.checklink", "Excepci\u00F3n de Seguridad: enlace: {0}" },
            { "appletsecurityexception.checkpropsaccess", "Excepci\u00F3n de Seguridad: propiedades" },
            { "appletsecurityexception.checkpropsaccess.key", "Excepci\u00F3n de Seguridad: acceso a propiedades {0}" },
            { "appletsecurityexception.checkread.exception1", "Excepci\u00F3n de Seguridad: {0}, {1}" },
            { "appletsecurityexception.checkread.exception2", "Excepci\u00F3n de Seguridad: file.read: {0}" },
            { "appletsecurityexception.checkread", "Excepci\u00F3n de Seguridad: file.read: {0} == {1}" },
            { "appletsecurityexception.checkwrite.exception", "Excepci\u00F3n de Seguridad: {0}, {1}" },
            { "appletsecurityexception.checkwrite", "Excepci\u00F3n de Seguridad: file.write: {0} == {1}" },
            { "appletsecurityexception.checkread.fd", "Excepci\u00F3n de Seguridad: fd.read" },
            { "appletsecurityexception.checkwrite.fd", "Excepci\u00F3n de Seguridad: fd.write" },
            { "appletsecurityexception.checklisten", "Excepci\u00F3n de Seguridad: socket.listen: {0}" },
            { "appletsecurityexception.checkaccept", "Excepci\u00F3n de Seguridad: socket.accept: {0}:{1}" },
            { "appletsecurityexception.checkconnect.networknone",
                "Excepci\u00F3n de Seguridad: socket.connect: {0}->{1}" },
            { "appletsecurityexception.checkconnect.networkhost1",
                "Excepci\u00F3n de Seguridad: no se puede conectar a {0} con origen de {1}." },
            { "appletsecurityexception.checkconnect.networkhost2",
                "Excepci\u00F3n de Seguridad: no se puede resolver la IP para el host {0} o para {1}. " },
            { "appletsecurityexception.checkconnect.networkhost3",
                "Excepci\u00F3n de Seguridad: no se puede resolver la IP para el host {0}. Consulte la propiedad trustProxy." },
            { "appletsecurityexception.checkconnect", "Excepci\u00F3n de Seguridad: conexi\u00F3n: {0}->{1}" },
            { "appletsecurityexception.checkpackageaccess",
                "Excepci\u00F3n de Seguridad: no se puede acceder al paquete: {0}" },
            { "appletsecurityexception.checkpackagedefinition",
                "Excepci\u00F3n de Seguridad: no se puede definir el paquete: {0}" },
            { "appletsecurityexception.cannotsetfactory",
                "Excepci\u00F3n de Seguridad: no se puede definir el valor de f\u00E1brica" },
            { "appletsecurityexception.checkmemberaccess",
                "Excepci\u00F3n de Seguridad: comprobar el acceso de miembro" },
            { "appletsecurityexception.checkgetprintjob", "Excepci\u00F3n de Seguridad: getPrintJob" },
            { "appletsecurityexception.checksystemclipboardaccess", "Excepci\u00F3n de Seguridad: getSystemClipboard" },
            { "appletsecurityexception.checkawteventqueueaccess", "Excepci\u00F3n de Seguridad: getEventQueue" },
            { "appletsecurityexception.checksecurityaccess",
                "Excepci\u00F3n de Seguridad: operaci\u00F3n de seguridad: {0}" },
            { "appletsecurityexception.getsecuritycontext.unknown",
                "tipo de cargador de clase desconocido. no se puede comprobar para getContext" },
            { "appletsecurityexception.checkread.unknown",
                "tipo de cargador de clase desconocido. no se puede comprobar para lectura de comprobaci\u00F3n {0}" },
            { "appletsecurityexception.checkconnect.unknown",
                "tipo de cargador de clase desconocido. no se puede comprobar para conexi\u00F3n de comprobaci\u00F3n" }, };

        return temp;
    }
}
