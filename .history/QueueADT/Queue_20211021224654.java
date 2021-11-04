InsertionSort (Arr, N) // Arr is an array of size N.
{
    For ( I:= 2 to N ) // N elements => (N-1) pass
    {
    // Pass 1 is trivially sorted, hence not considered
    // Subarray { Arr[1], Arr[2], ..., Arr[I-I] } is already sorted

        insert_at = I; // Find suitable position insert_at, for Arr[I]
        // Move subarray Arr [ insert_at: I-1 ] to one position right

        item = Arr[I]; J=I-1;
        While ( J ? 1 && item < Arr[J] )
        {
                Arr[J+1] = Arr[J]; // Move to right
                // insert_at = J;
                J--;
            }
            insert_at = J+1; // Insert at proper position
            Arr[insert_at] = item; // Arr[J+1] = item;
        }
    }
}
