package edu.uiowa.slis.BIBFRAME.Resource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ResourceSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ResourceSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ResourceSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Resource theResource = (Resource)findAncestorWithClass(this, Resource.class);
			if (!theResource.commitNeeded) {
				pageContext.getOut().print(theResource.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Resource theResource = (Resource)findAncestorWithClass(this, Resource.class);
			return theResource.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Resource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Resource theResource = (Resource)findAncestorWithClass(this, Resource.class);
			theResource.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Resource for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Resource for subjectURI tag ");
		}
	}
}

