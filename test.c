#include<stdio.h>
#include<unistd.h>
#include<stdlib.h>
#include<ctype.h>
#include<sys/types.h>


int main(void)
{
	pid_t pid;
	pid_t retPid;
	int status;
	int i;

	status = -1;
	if((pid = fork()) < 0)
	{
		printf("fork error\n");
		exit(-1);
	}
	else if (pid > 0)
	{
		printf("pid id - %d,subprocess id = %d\n",getpid(),pid);
		//retPid = wait(&status);
	//	retPid = WEXITSTATUS(status);
		retPid = waitpid(-1,&status,0);
		retPid = WEXITSTATUS(status);
		printf("retPid = %d,status= %d\n",retPid,status);
		exit(0);
	}
	else
		{
			printf("I am sub process,pid = %d\n",getpid());
			for(i = 0;i < 100;i++)
			{
				printf("run%d\n",i);
			}
			exit(9);
		}
	printf("mack\n");
	exit(0);
}

