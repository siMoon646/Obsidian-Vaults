**Logical Address Space:**
- Set of virtual addresses that a process can reference
- A logical address space with $n$ words will occupy $log_2(n)$ bits
- Static relocation:
	- Addresses are rewritten once -> when the program is loaded
	- Physical addresses are hardcoded into the instructions
	- The process cannot be moved in memory
- Dynamic relocation:
	- Addresses are not rewritten.
	- Every memory access, the MMU adds a base register value to the logical address on the fly to get the physical address.
	- The process can be moved in memory
- External Fragmentation: 
	- About the holes between alloc blocks that are too small or poorly placed to be used.

**50% rule**
- 2 allocation blocks : 1 hole

**Segmentation** 
- Variable size logical unit of a program -- meaningful chunk like the code section, stack, heap, or a specific function/data structure.
- Divides a program into logical units, and self-contained components:
- Uses variable size segments, can cause external frag
- segmentation allocates exactly what's requested, so no internal fragmentation
- doesn't eliminate swapping or compaction

Demand paging: 
- Memory management strat where pages are only loaded into physical memory when they are actually needed.

Algorithms for replacement strings:
FIFO: first in first out
LRU: least recently used
- Rear holds the least recently used.
ORA: optimal replacement algorithm

**Aging algorithm**:
- every d time units, shift the register right by 1 bit
- if the page was accessed in that intverval, set the leftmost bit to 1, otherwise 0

Second chance replacement algorithm: 
- When pages get r-bit = 1, when they're accessed during the reference string.
- Built around the FIFO algorithm, except we wrap around from the back to the front when looking for a page to replace, depending on their r-bit

Working set replacement algorithm:
- Set of unique pages referenced in the last n references

Page fault frequency algorithm:
- Algorithm that controls the number of frames allocated to a process based on how frequently it's experiencing page faults.

Thrashing:
- when a process or system spends more time paging than executing:
	- Happens when a process doesn't have enough frames to hold its working set, so it constantly page faults.

OFT: Open File Table:
- data structure tracking all open files.
- r/w buffer: buffer holding the file's data being read to memory
- pos: current offset in the file; where the next read or write operation(s) will occur.
- File metadata
- Operations:
	- Read(j, m, n)
		- j - the file that the operation is ran on
		- m, the memory variable to store the data into
		- n, the number in bytes to read
	- Seek(j, p)
		- j - the file that the operation is ran on
		- n, the position to move to

Disk fragmentation:
- When file's data is scattered across non-contiguous blocks on disk rather than stored sequentially.

Block allocation:
- Contiguous block allocation: 
	- Fast sequential access
	- Disk fragmentation inevitable -> likely caused by dynamic file growth
- Sequential block allocation: 
	- Each block contains a pointer to the next block pertaining to the same data structure.
	- All operations start from the root
- FAT: File allocation table:
	- Linked allocation variation that solves the sequential traversal problem by moving all the pointers out of the blocks and not a sperate table at the beginning of the disk.
	- Array where each entry corresponds to a disk block
		- Each entry contains the index of the next block in the file (or a special marker for end-of-file)

**I/O devices:**
- When interrupts are used, the driver process is blocked as data is transferred between device and controller buffer.
- DMA controller: Hardware to read and write to main memory
- Buffer: For decoupling device from its driver

