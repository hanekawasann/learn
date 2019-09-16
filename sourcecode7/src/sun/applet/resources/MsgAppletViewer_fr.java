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

public class MsgAppletViewer_fr extends ListResourceBundle {

    public Object[][] getContents() {
        Object[][] temp = new Object[][] { { "textframe.button.dismiss", "Abandonner" },
            { "appletviewer.tool.title", "Visualiseur d''applets : {0}" }, { "appletviewer.menu.applet", "Applet" },
            { "appletviewer.menuitem.restart", "Red\u00E9marrer" }, { "appletviewer.menuitem.reload", "Recharger" },
            { "appletviewer.menuitem.stop", "Arr\u00EAter" }, { "appletviewer.menuitem.save", "Enregistrer..." },
            { "appletviewer.menuitem.start", "D\u00E9marrer" }, { "appletviewer.menuitem.clone", "Cloner..." },
            { "appletviewer.menuitem.tag", "Baliser..." }, { "appletviewer.menuitem.info", "Informations..." },
            { "appletviewer.menuitem.edit", "Modifier" },
            { "appletviewer.menuitem.encoding", "Encodage de caract\u00E8res" },
            { "appletviewer.menuitem.print", "Imprimer..." },
            { "appletviewer.menuitem.props", "Propri\u00E9t\u00E9s..." }, { "appletviewer.menuitem.close", "Fermer" },
            { "appletviewer.menuitem.quit", "Quitter" }, { "appletviewer.label.hello", "Bonjour..." },
            { "appletviewer.status.start", "d\u00E9marrage de l'applet..." },
            { "appletviewer.appletsave.filedialogtitle", "S\u00E9rialiser l'applet dans le fichier" },
            { "appletviewer.appletsave.err1", "S\u00E9rialisation de {0} vers {1}" },
            { "appletviewer.appletsave.err2", "dans appletSave : {0}" },
            { "appletviewer.applettag", "Balise affich\u00E9e" },
            { "appletviewer.applettag.textframe", "Balise HTML d'applet" },
            { "appletviewer.appletinfo.applet", "-- aucune information d'applet --" },
            { "appletviewer.appletinfo.param", "-- aucune information de param\u00E8tre --" },
            { "appletviewer.appletinfo.textframe", "Informations d'applet" },
            { "appletviewer.appletprint.fail", "Echec de l'impression." },
            { "appletviewer.appletprint.finish", "Impression termin\u00E9e." },
            { "appletviewer.appletprint.cancel", "Impression annul\u00E9e." },
            { "appletviewer.appletencoding", "Encodage de caract\u00E8res : {0}" },
            { "appletviewer.parse.warning.requiresname",
                "Avertissement : la balise <param name=... value=...> requiert un attribut de nom." },
            { "appletviewer.parse.warning.paramoutside",
                "Avertissement : la balise <param> est en dehors des balises <applet> ... </applet>." },
            { "appletviewer.parse.warning.applet.requirescode",
                "Avertissement : la balise <applet> requiert un attribut de code." },
            { "appletviewer.parse.warning.applet.requiresheight",
                "Avertissement : la balise <applet> requiert un attribut de hauteur." },
            { "appletviewer.parse.warning.applet.requireswidth",
                "Avertissement : la balise <applet> requiert un attribut de largeur." },
            { "appletviewer.parse.warning.object.requirescode",
                "Avertissement : la balise <object> requiert un attribut de code." },
            { "appletviewer.parse.warning.object.requiresheight",
                "Avertissement : la balise <object> requiert un attribut de hauteur." },
            { "appletviewer.parse.warning.object.requireswidth",
                "Avertissement : la balise <object> requiert un attribut de largeur." },
            { "appletviewer.parse.warning.embed.requirescode",
                "Avertissement : la balise <embed> requiert un attribut de code." },
            { "appletviewer.parse.warning.embed.requiresheight",
                "Avertissement : la balise <embed> requiert un attribut de hauteur." },
            { "appletviewer.parse.warning.embed.requireswidth",
                "Avertissement : la balise <embed> requiert un attribut de largeur." },
            { "appletviewer.parse.warning.appnotLongersupported",
                "Avertissement : la balise <app> n'est plus prise en charge, utilisez <applet> \u00E0 la place :" },
            { "appletviewer.usage",
                "Syntaxe : appletviewer <options> url(s)\n\no\u00F9 <options> inclut :\n  -debug                  D\u00E9marrer le visualiseur d'applets dans le d\u00E9bogueur Java\n  -encoding <encoding>    Indiquer l'encodage de caract\u00E8res utilis\u00E9 par les fichiers HTML\n  -J<runtime flag>        Transmettre l'argument \u00E0 l'interpr\u00E9teur Java\n\nL'option -J n'est pas standard et elle peut \u00EAtre modifi\u00E9e sans pr\u00E9avis." },
            { "appletviewer.main.err.unsupportedopt", "Option non prise en charge : {0}" },
            { "appletviewer.main.err.unrecognizedarg", "Argument non reconnu : {0}" },
            { "appletviewer.main.err.dupoption", "Utilisation en double de l''option : {0}" },
            { "appletviewer.main.err.inputfile", "Aucun fichier d'entr\u00E9e indiqu\u00E9." },
            { "appletviewer.main.err.badurl", "URL incorrecte : {0} ({1})" },
            { "appletviewer.main.err.io", "Exception d''E/S lors de la lecture : {0}" },
            { "appletviewer.main.err.readablefile", "Assurez-vous que {0} est un fichier accessible en lecture." },
            { "appletviewer.main.err.correcturl", "L''\u00E9l\u00E9ment {0} est-il l''URL correcte ?" },
            { "appletviewer.main.prop.store", "Propri\u00E9t\u00E9s utilisateur pour AppletViewer" },
            { "appletviewer.main.err.prop.cantread",
                "Impossible de lire le fichier de propri\u00E9t\u00E9s utilisateur : {0}" },
            { "appletviewer.main.err.prop.cantsave",
                "Impossible d''enregistrer le fichier de propri\u00E9t\u00E9s utilisateur : {0}" },
            { "appletviewer.main.warn.nosecmgr", "Avertissement : d\u00E9sactivation de la s\u00E9curit\u00E9." },
            { "appletviewer.main.debug.cantfinddebug", "D\u00E9bogueur introuvable." },
            { "appletviewer.main.debug.cantfindmain",
                "La m\u00E9thode principale est introuvable dans le d\u00E9bogueur." },
            { "appletviewer.main.debug.exceptionindebug", "Exception d\u00E9tect\u00E9e dans le d\u00E9bogueur." },
            { "appletviewer.main.debug.cantaccess", "Impossible d'acc\u00E9der au d\u00E9bogueur." },
            { "appletviewer.main.nosecmgr", "Avertissement : SecurityManager n'est pas install\u00E9." },
            { "appletviewer.main.warning",
                "Avertissement : aucune applet n'a \u00E9t\u00E9 d\u00E9marr\u00E9e. Assurez-vous que l'entr\u00E9e contient une balise <applet>." },
            { "appletviewer.main.warn.prop.overwrite",
                "Avertissement : remplacement temporaire de la propri\u00E9t\u00E9 syst\u00E8me \u00E0 la demande de l''utilisateur - Cl\u00E9 : {0}, ancienne valeur : {1}, nouvelle valeur : {2}" },
            { "appletviewer.main.warn.cantreadprops",
                "Avertissement : impossible de lire le fichier de propri\u00E9t\u00E9s d''AppletViewer : {0} Utilisation des valeurs par d\u00E9faut." },
            { "appletioexception.loadclass.throw.interrupted", "chargement de classe interrompu : {0}" },
            { "appletioexception.loadclass.throw.notloaded", "classe non charg\u00E9e : {0}" },
            { "appletclassloader.loadcode.verbose", "Ouverture du flux de donn\u00E9es dans {0} pour obtenir {1}" },
            { "appletclassloader.filenotfound", "Fichier introuvable lors de la recherche de {0}" },
            { "appletclassloader.fileformat",
                "Exception de format de fichier d\u00E9tect\u00E9e lors du chargement de : {0}" },
            { "appletclassloader.fileioexception", "Exception d''E/S lors du chargement de : {0}" },
            { "appletclassloader.fileexception", "Exception {0} lors du chargement de : {1}" },
            { "appletclassloader.filedeath", "Fermeture de {0} lors du chargement de : {1}" },
            { "appletclassloader.fileerror", "Erreur {0} lors du chargement de : {1}" },
            { "appletclassloader.findclass.verbose.openstream",
                "Ouverture du flux de donn\u00E9es dans {0} pour obtenir {1}" },
            { "appletclassloader.getresource.verbose.forname", "AppletClassLoader.getResource pour le nom : {0}" },
            { "appletclassloader.getresource.verbose.found",
                "Ressource {0} trouv\u00E9e en tant que ressource syst\u00E8me" },
            { "appletclassloader.getresourceasstream.verbose",
                "Ressource {0} trouv\u00E9e en tant que ressource syst\u00E8me" },
            { "appletpanel.runloader.err", "Param\u00E8tre d'objet ou de code." },
            { "appletpanel.runloader.exception", "exception lors de la d\u00E9s\u00E9rialisation de {0}" },
            { "appletpanel.destroyed", "Applet d\u00E9truite." }, { "appletpanel.loaded", "Applet charg\u00E9e." },
            { "appletpanel.started", "Applet d\u00E9marr\u00E9e." },
            { "appletpanel.inited", "Applet initialis\u00E9e." },
            { "appletpanel.stopped", "Applet arr\u00EAt\u00E9e." },
            { "appletpanel.disposed", "Applet \u00E9limin\u00E9e." },
            { "appletpanel.nocode", "Param\u00E8tre CODE manquant dans la balise APPLET." },
            { "appletpanel.notfound", "Charger : la classe {0} est introuvable." },
            { "appletpanel.nocreate", "Charger : impossible d''instantier {0}." }, { "appletpanel.noconstruct",
            "Charger : l''\u00E9l\u00E9ment {0} n''est pas public ou ne poss\u00E8de aucun constructeur public." },
            { "appletpanel.death", "arr\u00EAt\u00E9" }, { "appletpanel.exception", "exception : {0}." },
            { "appletpanel.exception2", "exception : {0} : {1}." }, { "appletpanel.error", "erreur : {0}." },
            { "appletpanel.error2", "erreur : {0} : {1}." },
            { "appletpanel.notloaded", "Initialiser : applet non charg\u00E9e." },
            { "appletpanel.notinited", "D\u00E9marrer : applet non initialis\u00E9e." },
            { "appletpanel.notstarted", "Arr\u00EAter : applet non d\u00E9marr\u00E9e." },
            { "appletpanel.notstopped", "D\u00E9truire : applet non arr\u00EAt\u00E9e." },
            { "appletpanel.notdestroyed", "Eliminer : applet non d\u00E9truite." },
            { "appletpanel.notdisposed", "Charger : applet non \u00E9limin\u00E9e." },
            { "appletpanel.bail", "Interrompu : r\u00E9solution." },
            { "appletpanel.filenotfound", "Fichier introuvable lors de la recherche de {0}" },
            { "appletpanel.fileformat",
                "Exception de format de fichier d\u00E9tect\u00E9e lors du chargement de : {0}" },
            { "appletpanel.fileioexception", "Exception d''E/S lors du chargement de : {0}" },
            { "appletpanel.fileexception", "Exception {0} lors du chargement de : {1}" },
            { "appletpanel.filedeath", "Fermeture de {0} lors du chargement de : {1}" },
            { "appletpanel.fileerror", "Erreur {0} lors du chargement de : {1}" },
            { "appletpanel.badattribute.exception",
                "Analyse HTML : valeur incorrecte pour l'attribut de largeur/hauteur" },
            { "appletillegalargumentexception.objectinputstream",
                "AppletObjectInputStream requiert un chargeur non NULL" },
            { "appletprops.title", "Propri\u00E9t\u00E9s d'AppletViewer" },
            { "appletprops.label.http.server", "Serveur proxy HTTP :" },
            { "appletprops.label.http.proxy", "Port proxy HTTP :" },
            { "appletprops.label.network", "Acc\u00E8s au r\u00E9seau :" },
            { "appletprops.choice.network.item.none", "Aucun" },
            { "appletprops.choice.network.item.applethost", "H\u00F4te de l'applet" },
            { "appletprops.choice.network.item.unrestricted", "Sans restriction" },
            { "appletprops.label.class", "Acc\u00E8s \u00E0 la classe :" },
            { "appletprops.choice.class.item.restricted", "Avec restriction" },
            { "appletprops.choice.class.item.unrestricted", "Sans restriction" },
            { "appletprops.label.unsignedapplet", "Autoriser les applets non sign\u00E9es :" },
            { "appletprops.choice.unsignedapplet.no", "Non" }, { "appletprops.choice.unsignedapplet.yes", "Oui" },
            { "appletprops.button.apply", "Appliquer" }, { "appletprops.button.cancel", "Annuler" },
            { "appletprops.button.reset", "R\u00E9initialiser" },
            { "appletprops.apply.exception", "Echec de l''enregistrement des propri\u00E9t\u00E9s : {0}" },
            /* 4066432 */
            { "appletprops.title.invalidproxy", "Entr\u00E9e non valide" },
            { "appletprops.label.invalidproxy", "Le port proxy doit \u00EAtre un entier positif." },
            { "appletprops.button.ok", "OK" },
            /* end 4066432 */
            { "appletprops.prop.store", "Propri\u00E9t\u00E9s utilisateur pour AppletViewer" },
            { "appletsecurityexception.checkcreateclassloader",
                "Exception de s\u00E9curit\u00E9 : chargeur de classe" },
            { "appletsecurityexception.checkaccess.thread", "Exception de s\u00E9curit\u00E9 : thread" },
            { "appletsecurityexception.checkaccess.threadgroup",
                "Exception de s\u00E9curit\u00E9 : groupe de threads : {0}" },
            { "appletsecurityexception.checkexit", "Exception de s\u00E9curit\u00E9 : sortie : {0}" },
            { "appletsecurityexception.checkexec", "Exception de s\u00E9curit\u00E9 : ex\u00E9cution : {0}" },
            { "appletsecurityexception.checklink", "Exception de s\u00E9curit\u00E9 : lien : {0}" },
            { "appletsecurityexception.checkpropsaccess", "Exception de s\u00E9curit\u00E9 : propri\u00E9t\u00E9s" },
            { "appletsecurityexception.checkpropsaccess.key",
                "Exception de s\u00E9curit\u00E9 : acc\u00E8s aux propri\u00E9t\u00E9s {0}" },
            { "appletsecurityexception.checkread.exception1", "Exception de s\u00E9curit\u00E9 : {0}, {1}" },
            { "appletsecurityexception.checkread.exception2", "Exception de s\u00E9curit\u00E9 : file.read : {0}" },
            { "appletsecurityexception.checkread", "Exception de s\u00E9curit\u00E9 : file.read : {0} == {1}" },
            { "appletsecurityexception.checkwrite.exception", "Exception de s\u00E9curit\u00E9 : {0}, {1}" },
            { "appletsecurityexception.checkwrite", "Exception de s\u00E9curit\u00E9 : file.write : {0} == {1}" },
            { "appletsecurityexception.checkread.fd", "Exception de s\u00E9curit\u00E9 : fd.read" },
            { "appletsecurityexception.checkwrite.fd", "Exception de s\u00E9curit\u00E9 : fd.write" },
            { "appletsecurityexception.checklisten", "Exception de s\u00E9curit\u00E9 : socket.listen : {0}" },
            { "appletsecurityexception.checkaccept", "Exception de s\u00E9curit\u00E9 : socket.accept : {0} : {1}" },
            { "appletsecurityexception.checkconnect.networknone",
                "Exception de s\u00E9curit\u00E9 : socket.connect : {0} -> {1}" },
            { "appletsecurityexception.checkconnect.networkhost1",
                "Exception de s\u00E9curit\u00E9 : impossible de se connecter \u00E0 {0} dont l''origine est {1}." },
            { "appletsecurityexception.checkconnect.networkhost2",
                "Exception de s\u00E9curit\u00E9 : impossible de r\u00E9soudre l''adresse IP pour l''h\u00F4te {0} ou pour {1}. " },
            { "appletsecurityexception.checkconnect.networkhost3",
                "Exception de s\u00E9curit\u00E9 : impossible de r\u00E9soudre l''adresse IP pour l''h\u00F4te {0}. Voir la propri\u00E9t\u00E9 trustProxy." },
            { "appletsecurityexception.checkconnect", "Exception de s\u00E9curit\u00E9 : connexion : {0} -> {1}" },
            { "appletsecurityexception.checkpackageaccess",
                "Exception de s\u00E9curit\u00E9 : impossible d''acc\u00E9der au package : {0}" },
            { "appletsecurityexception.checkpackagedefinition",
                "Exception de s\u00E9curit\u00E9 : impossible de d\u00E9finir le package : {0}" },
            { "appletsecurityexception.cannotsetfactory",
                "Exception de s\u00E9curit\u00E9 : impossible de d\u00E9finir la fabrique" },
            { "appletsecurityexception.checkmemberaccess",
                "Exception de s\u00E9curit\u00E9 : v\u00E9rifier l'acc\u00E8s des membres" },
            { "appletsecurityexception.checkgetprintjob", "Exception de s\u00E9curit\u00E9 : getPrintJob" },
            { "appletsecurityexception.checksystemclipboardaccess",
                "Exception de s\u00E9curit\u00E9 : getSystemClipboard" },
            { "appletsecurityexception.checkawteventqueueaccess", "Exception de s\u00E9curit\u00E9 : getEventQueue" },
            { "appletsecurityexception.checksecurityaccess",
                "Exception de s\u00E9curit\u00E9 : op\u00E9ration de s\u00E9curit\u00E9 : {0}" },
            { "appletsecurityexception.getsecuritycontext.unknown",
                "type de chargeur de classe inconnu, impossible de rechercher getContext" },
            { "appletsecurityexception.checkread.unknown",
                "type de chargeur de classe inconnu, impossible de rechercher la v\u00E9rification de lecture {0}" },
            { "appletsecurityexception.checkconnect.unknown",
                "type de chargeur de classe inconnu, impossible de rechercher la v\u00E9rification de connexion" }, };

        return temp;
    }
}
