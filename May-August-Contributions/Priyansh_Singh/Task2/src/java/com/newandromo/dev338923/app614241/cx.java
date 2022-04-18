/*
 *  
 * 
 * Could not load the following classes:
 *  android.support.v7.widget.Toolbar
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  java.lang.Object
 *  java.lang.Runnable
 */
package com.newandromo.dev338923.app614241;

import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import com.newandromo.dev338923.app614241.bn;

public final class cx {
    public static void a(final Toolbar toolbar, final int n2) {
        if (toolbar != null) {
            toolbar.post(new Runnable(){

                public final void run() {
                    Menu menu = toolbar.getMenu();
                    int n22 = n2;
                    if (menu != null) {
                        int n3 = menu.size();
                        for (int i2 = 0; i2 < n3; ++i2) {
                            MenuItem menuItem = menu.getItem(i2);
                            bn.a(menuItem, n22);
                            if (!menuItem.hasSubMenu()) continue;
                            SubMenu subMenu = menuItem.getSubMenu();
                            int n4 = subMenu.size();
                            for (int i3 = 0; i3 < n4; ++i3) {
                                bn.a(subMenu.getItem(i3), n22);
                            }
                        }
                    }
                }
            });
        }
    }

}

