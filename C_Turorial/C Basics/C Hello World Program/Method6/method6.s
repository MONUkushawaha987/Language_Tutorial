	.file	"method6.c"
	.text
	.def	___main;	.scl	2;	.type	32;	.endef
	.section .rdata,"dr"
LC0:
	.ascii "Hello, World!\12\0"
	.text
	.globl	_main
	.def	_main;	.scl	2;	.type	32;	.endef
_main:
LFB13:
	.cfi_startproc
	pushl	%ebp
	.cfi_def_cfa_offset 8
	.cfi_offset 5, -8
	movl	%esp, %ebp
	.cfi_def_cfa_register 5
	andl	$-16, %esp
	subl	$32, %esp
	call	___main
	movl	$LC0, 28(%esp)
	jmp	L2
L3:
	movl	28(%esp), %eax
	leal	1(%eax), %edx
	movl	%edx, 28(%esp)
	movzbl	(%eax), %eax
	movsbl	%al, %eax
	movl	%eax, (%esp)
	call	_putchar
L2:
	movl	28(%esp), %eax
	movzbl	(%eax), %eax
	testb	%al, %al
	jne	L3
	movl	$0, %eax
	leave
	.cfi_restore 5
	.cfi_def_cfa 4, 4
	ret
	.cfi_endproc
LFE13:
	.ident	"GCC: (MinGW.org GCC Build-2) 9.2.0"
	.def	_putchar;	.scl	2;	.type	32;	.endef
