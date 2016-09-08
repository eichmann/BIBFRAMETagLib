package edu.uiowa.slis.BIBFRAME.ContainerTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ContainerTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ContainerTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ContainerTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			ContainerTitle theContainerTitle = (ContainerTitle)findAncestorWithClass(this, ContainerTitle.class);
			if (!theContainerTitle.commitNeeded) {
				pageContext.getOut().print(theContainerTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			ContainerTitle theContainerTitle = (ContainerTitle)findAncestorWithClass(this, ContainerTitle.class);
			return theContainerTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing ContainerTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			ContainerTitle theContainerTitle = (ContainerTitle)findAncestorWithClass(this, ContainerTitle.class);
			theContainerTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing ContainerTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing ContainerTitle for subjectURI tag ");
		}
	}
}

