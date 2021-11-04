using System;
// Commnet không được biên dịch khi dịch chương trình
namespace Demo
{
    // <summary>
    // Comment cho class
    // </summary>
    class Program
    {
        //<summary>
        // Comment cho hàm
        // </summary>
        // <param name="args"></param>
        static void Main(string[] args)
        {
            // Comment cho 1 dòng
            Console.Write("K Team");    // Hoàn toàn có thể comment như thế này.

            Console.ReadKey(/*haha đoạn comment này không được biên dịch*/);

            /*Comment*/
            /*
            *Hay như thế này
             */

        }   // đoạn code/chữ bạn viết phía sau dấu // sẽ không được biên dịch. Nhưng đoạn code phía trước đó vẫn được biên dịch bình thường
    }
}