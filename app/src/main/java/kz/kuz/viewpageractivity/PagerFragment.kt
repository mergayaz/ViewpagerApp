package kz.kuz.viewpageractivity

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class PagerFragment : Fragment() {
    var mTitle: String? = null
    var mPart1: String? = null
    var mPart2: String? = null

    // методы фрагмента должны быть открытыми
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mTitle = arguments!!.getString("title")
        mPart1 = arguments!!.getString("part1")
        mPart2 = arguments!!.getString("part2")
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        activity!!.setTitle(R.string.toolbar_title)
        val view = inflater.inflate(R.layout.fragment_pager, container, false)
        val title = view.findViewById<TextView>(R.id.title)
        title.text = mTitle
        val part1 = view.findViewById<TextView>(R.id.part1)
        part1.text = mPart1
        val part2 = view.findViewById<TextView>(R.id.part2)
        part2.text = mPart2
        return view
    }

    companion object {
        fun newInstance(title: String?, part1: String?, part2: String?): PagerFragment {
            val args = Bundle()
            args.putString("title", title)
            args.putString("part1", part1)
            args.putString("part2", part2)
            val fragment = PagerFragment()
            fragment.arguments = args
            return fragment
        }
    }
}