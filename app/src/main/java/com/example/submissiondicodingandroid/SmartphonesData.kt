package com.example.submissiondicodingandroid

object SmartphonesData {
    private val smartphoneDetail = arrayOf(
        arrayOf(
            "Iphone 12 Pro Max",
            "Rp. 15.000.000",
            "GSM/HSPA/LTE/5G\n" + "2020, November 13\n" + "Super Retina OLED 6,7 inches\n" + "Apple A14\n" + "128GB/6GB RAM\n" + "Li-Ion 3687 mAh",
            R.drawable.apple_iphone_12_promax
        ),
        arrayOf(
            "Samsung Galaxy A51",
            "Rp. 3.000.000",
            "GSM/HSPA/LTE\n" + "2019, December 16\n" + "Super AMOLED 6,5 inches\n" + "Exynos 9611\n" + "64GB/4GB RAM\n" + "Li-Po 4000 mAh",
            R.drawable.samsung_galaxy_a51
        ),
        arrayOf(
            "Samsung Galaxy Note 20",
            "Rp. 15.000.000",
            "GSM/HSPA/LTE/5G\n" + "2020, August 21\n" + "Dynamic AMOLED 6,9 inches\n" + "Exynos 990\n" + "128GB/12GB RAM\n" + "Li-Ion 4500 mAh",
            R.drawable.samsung_galaxy_note20_ultra
        ),
        arrayOf(
            "Samsung Galaxy S20 Ultra",
            "Rp. 11.500.000",
            "GSM/HSPA/LTE/5G\n" + "2020, March 06\n" + "Dynamic AMOLED 6,9 inches\n" + "Exynos 990\n" + "128GB/12GB RAM\n" + "Li-Ion 5000 mAh",
            R.drawable.samsung_galaxy_s20_ultra
        ),
        arrayOf(
            "Samsung Galaxy S21 Ultra",
            "Rp. 12.500.000",
            "GSM/HSPA/LTE/5G\n" + "2021, january 29\n" + "Dynamic AMOLED 6,8 inches\n" + "Exynos 2100\n" + "128GB/12GB RAM\n" + "Li-Ion 5000 mAh",
            R.drawable.samsung_galaxy_s21_ultra_5g
        ),
        arrayOf(
            "Sony Xperia 1 II",
            "Rp. 10.800.000",
            "GSM/HSPA/LTE/5G\n" + "2020, May 22\n" + "OLED 6,5 inches\n" + "Snapdragon 865\n" + "256GB/8GB RAM\n" + "Li-Po 4000 mAh",
            R.drawable.sony_xperia_1_
        ),
        arrayOf(
            "Xiaomi Mi 11",
            "Rp. 12.000.000",
            "GSM/HSPA/LTE/5G\n" + "2021, January 01\n" + "AMOLED 6,81 inches\n" + "Snapdragon 888\n" + "128GB/8GB RAM\n" + "Li-Po 4600 mAh",
            R.drawable.xiaomi_mi11
        ),
        arrayOf(
            "Xiaomi Mi 10 Pro 5G",
            "Rp. 12.500.000",
            "GSM/HSPA/LTE/5G\n" + "2020, February 18\n" + "Super AMOLED 6,67 inches\n" + "Snapdragon 865\n" + "256GB/8GB RAM\n" + "Li-Po 4500 mAh",
            R.drawable.xiaomi_mi_10_pro_5g
        ),
        arrayOf(
            "Xiaomi Poco X3 NFC",
            "Rp. 2.600.000",
            "GSM/HSPA/LTE\n" + "2020, September 08\n" + "IPS LCD 6,67 inches\n" + "Snapdragon 732G\n" + "64GB/6GB RAM\n" + "Li-Po 5160 mAh",
            R.drawable.xiaomi_poco_x3_nfc
        ),
        arrayOf(
            "Redmi Note 9 Pro",
            "Rp. 3.200.000",
            "GSM/HSPA/LTE\n" + "2020, May 05\n" + "IPS LCD 6,67 inches\n" + "Snapdragon 720G\n" + "64GB/6GB RAM\n" + "Li-Po 5020 mAh",
            R.drawable.xiaomi_redmi_note_9_pro
        )
    )

    val listData: ArrayList<Smartphone> get() {
        val list = arrayListOf<Smartphone>()
        for (position in smartphoneDetail) {
            val smartphone = Smartphone()
            smartphone.name = position[0].toString()
            smartphone.price = position[1].toString()
            smartphone.specDetail = position[2].toString()
            smartphone.photo = position[3] as Int

            list.add(smartphone)
        }
        return list
    }
}