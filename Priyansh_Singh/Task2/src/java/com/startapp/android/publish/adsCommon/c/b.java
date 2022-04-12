/*
 *  
 * 
 * Could not load the following classes:
 *  android.bluetooth.BluetoothAdapter
 *  android.bluetooth.BluetoothDevice
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.os.Parcelable
 *  com.startapp.common.a.c
 *  com.startapp.common.a.h
 *  com.startapp.common.d
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashSet
 *  java.util.Set
 *  org.json.JSONObject
 */
package com.startapp.android.publish.adsCommon.c;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Parcelable;
import com.startapp.android.publish.adsCommon.c.a;
import com.startapp.common.a.c;
import com.startapp.common.a.h;
import com.startapp.common.d;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONObject;

public class b {
    protected Context a;
    protected d b;
    protected a c;
    protected BluetoothAdapter d;
    protected BroadcastReceiver e;

    public b(Context context, d d2) {
        this.a = context;
        this.b = d2;
        this.c = new a();
        this.d = b.super.d();
    }

    private Set<BluetoothDevice> c() {
        HashSet hashSet = new HashSet();
        try {
            if (c.a((Context)this.a, (String)"android.permission.BLUETOOTH") && this.d.isEnabled()) {
                Set set = this.d.getBondedDevices();
                return set;
            }
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder("Unable to get devices ");
            stringBuilder.append(exception.getMessage());
            h.a((int)6, (String)stringBuilder.toString());
        }
        return hashSet;
    }

    private BluetoothAdapter d() {
        if (c.a((Context)this.a, (String)"android.permission.BLUETOOTH")) {
            return BluetoothAdapter.getDefaultAdapter();
        }
        return null;
    }

    private BroadcastReceiver e() {
        return new BroadcastReceiver(){

            public void onReceive(Context context, Intent intent) {
                String string = intent.getAction();
                if ("android.bluetooth.device.action.FOUND".equals((Object)string)) {
                    BluetoothDevice bluetoothDevice = (BluetoothDevice)intent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
                    b.this.c.a(bluetoothDevice);
                    return;
                }
                if ("android.bluetooth.adapter.action.DISCOVERY_FINISHED".equals((Object)string)) {
                    b.this.a();
                    b.this.b.a((Object)b.this.b());
                }
            }
        };
    }

    public void a() {
        if (c.a((Context)this.a, (String)"android.permission.BLUETOOTH_ADMIN") && this.e != null && this.d != null) {
            this.d.cancelDiscovery();
            try {
                this.a.unregisterReceiver(this.e);
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder("BluetoothManager - stop() ");
                stringBuilder.append(exception.getMessage());
                h.a((int)3, (String)stringBuilder.toString());
            }
            this.e = null;
        }
    }

    public void a(boolean bl) {
        if (this.d != null && this.d.isEnabled()) {
            this.c.a(b.super.c());
            if (bl && c.a((Context)this.a, (String)"android.permission.BLUETOOTH_ADMIN")) {
                IntentFilter intentFilter = new IntentFilter("android.bluetooth.device.action.FOUND");
                this.e = b.super.e();
                try {
                    this.a.registerReceiver(this.e, intentFilter);
                    this.d.startDiscovery();
                    return;
                }
                catch (Exception exception) {
                    StringBuilder stringBuilder = new StringBuilder("BluetoothManager - start() ");
                    stringBuilder.append(exception.getMessage());
                    h.a((int)3, (String)stringBuilder.toString());
                    this.d.cancelDiscovery();
                    this.b.a((Object)this.b());
                    return;
                }
            }
            this.b.a((Object)this.b());
            return;
        }
        this.b.a(null);
    }

    public JSONObject b() {
        try {
            JSONObject jSONObject = this.c.a();
            return jSONObject;
        }
        catch (Exception exception) {
            return null;
        }
    }

}

