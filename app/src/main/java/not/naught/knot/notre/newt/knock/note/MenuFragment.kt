package not.naught.knot.notre.newt.knock.note

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import not.naught.knot.notre.newt.knock.note.databinding.FragmentMenuBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class MenuFragment : Fragment() {

    private var _binding: FragmentMenuBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMenuBinding.inflate(inflater, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonAddNote.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_addNoteFragment)
        }

        binding.buttonSeeNotes.setOnClickListener {
            findNavController().navigate(R.id.action_menuFragment_to_viewNotesFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}