package com.ifa.sakato.utils

import com.ifa.sakato.R
import com.ifa.sakato.model.Contact

object DataContactDummy {
    fun getContact(): ArrayList<Contact>{
        val contacts = ArrayList<Contact>()
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "Retur dan Konfirmasi Penerimaan",
                "bendum.kppn010@gmail.com"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "Pengelolaan Rekening",
                "spirnt.kemenkeu.go.id"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "Rekonsilisasi Laporan Keuangan",
                "e-rekon-lk.kemenkeu.go.id"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "LPJ",
                "vera010@kemenkeu.go.id"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "CSO (Customer Service Officer)",
                "cso.padang@kemenkeu.go.id"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "E-SPM",
                "espm.kemenkeu.go.id"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "OM SPAN",
                "spanint.kemenkeu.go.id"
            )
        )
        contacts.add(
            Contact(
                R.drawable.sakatologo,
                "Social Media",
                "www.youtube.com/c/KPPNPadang010/" +
                        "\nwww.instagram.com/kppnpadang/" +
                        "\nm.facebook.com/kppnpadang10/"
            )
        )
        return contacts
    }
}