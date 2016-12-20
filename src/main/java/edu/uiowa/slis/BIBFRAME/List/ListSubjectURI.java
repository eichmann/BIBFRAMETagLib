package edu.uiowa.slis.BIBFRAME.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ListSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ListSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(ListSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			List theList = (List)findAncestorWithClass(this, List.class);
			if (!theList.commitNeeded) {
				pageContext.getOut().print(theList.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing List for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			List theList = (List)findAncestorWithClass(this, List.class);
			return theList.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing List for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			List theList = (List)findAncestorWithClass(this, List.class);
			theList.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing List for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing List for subjectURI tag ");
		}
	}
}

