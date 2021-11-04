BubbleSort (Arr, N) // Arr is an array of size N.
{
    For ( I:= 1 to (N-1) ) // N elements => (N-1) pass
    {
    // Swap adjacent elements of Arr[1:(N-I)]such that
    // largest among { Arr[1], Arr[2], ..., Arr[N-I] } reaches to Arr[N-I]
        noSwap = true; // Check occurrence of swapping in inner loop
        For ( J:= 1 to  (N-I) ) // Execute the pass
        {
            If ( Arr [J] > Arr[J+1] )
            {
                Swap( Arr[j], Arr[J+1] );
                noSwap = false;
            }
        }
        If (noSwap) // exit the loop
            break;
    }
}
