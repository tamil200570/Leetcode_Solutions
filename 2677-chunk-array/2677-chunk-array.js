/**
 * @param {Array} arr
 * @param {number} size
 * @return {Array}
 */
var chunk = function(arr, size) 
{
     let nums=[];
     let temp=[];
     for(let val of arr)
     {
         temp.push(val);
         if(temp.length===size)
         {
            nums.push(temp);
            temp=[];
         }
     }
     if(temp.length!==0)
     {
        nums.push(temp);
     }
     return nums;
};
