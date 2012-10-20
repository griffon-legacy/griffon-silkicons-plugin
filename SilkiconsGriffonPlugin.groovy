/*
 * Copyright 2010-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * @author Andres.Almiray
 */
class SilkiconsGriffonPlugin {
    // the plugin version
    String version = '1.0.0'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '1.0.0 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '1.0.0']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'Apache Software License 2.0'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-silkicons-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = "Marc James' Silk icon set"
    String description = '''
Provides a shortcut for adding icons based on Marc James' [Silk icon set][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*   | *Property* | *Type* | *Default*   | *Bindable* |
| -------- | ---------- | ------ | ----------- | ---------- |
| silkIcon | icon       | String |             | no         |

Valid values for `icon` can be obtained by running **silk-icon-selector** and inspecting the tooltip of the chosen icon.

Scripts
-------

 * **silk-icon-selector** - launches a window that displays all available icons (Hover an icon to see the icon name)

[1]: http://www.famfamfam.com/lab/icons/silk/
'''
}
