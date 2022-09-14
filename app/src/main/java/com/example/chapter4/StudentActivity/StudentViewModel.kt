package com.example.chapter4.StudentActivity

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.chapter4.R

class StudentViewModel : ViewModel() {
    val list = arrayListOf (
        DataStudent ("Hacker Jangan Menyerang", "danialfarros","18/10/2022", R.drawable.bjorka,"kata Jony G plate jangan menyerang ya"),
        DataStudent ("Perayaan Tahun Baru ditengah Pandemi", "muhammadburhan", "18/10/2022", R.drawable.happynuyear, "pandemi datang hati tidak senang"),
        DataStudent ("berikut adalah sosok gus syamsudin", "helsa", "18/10/2022", R.drawable.imagepicture, "syamsyuddin di gresik adalah sosok pemulung yang ramah"),
        DataStudent ("tetap tersenyum ditengah serangan hacker", "helsa", "17/10/2022", R.drawable.kalaubisajanganmenyerang, " pemerintah sedang merayakan ulang tahun ketua DPR meskipun tengah di serang hacker"),
        DataStudent ("ternyata ini alasasan luhut tidak vaksin", "anonim", "17/10/2022", R.drawable.luhutbelumvaksin," luhut punya riwayatr alergi kutu"),
        DataStudent ("Bersama jikiti membangun negeri", "wotabee", "17/10/2022", R.drawable.oioi2, "Jangan lupa nonoton jekiti di manifest"),
        DataStudent ("jokowi 2 Periode digantikan Anis", "laskar FII", "16/10/2022", R.drawable.periodeoioi, "penembakan laskar FPI kasusnya akan di dalami ulang"),
        DataStudent ("Begini cara mengatasi serangan hacker", "muhammadburhan", "16/10/2022", R.drawable.happynuyear, "tetap santuy dan siap membantuy"),
        DataStudent ("begini kerja syamsuddin setelah kehilangan job", "helsa", "15/10/2022", R.drawable.imagepicture, " ya main tiktok aja"),
        DataStudent ("tetap tenang dan siap menyerang", "helsa", "13/10/2022", R.drawable.kalaubisajanganmenyerang, "capek broo"),
    )

    val studentList : MutableLiveData<List<DataStudent>> = MutableLiveData()

    fun getStudent(){
        var murid = list
        studentList.value = murid
    }
}