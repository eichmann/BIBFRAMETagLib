package edu.uiowa.slis.BIBFRAME.Index;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class IndexSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static IndexSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(IndexSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			Index theIndex = (Index)findAncestorWithClass(this, Index.class);
			if (!theIndex.commitNeeded) {
				pageContext.getOut().print(theIndex.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing Index for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			Index theIndex = (Index)findAncestorWithClass(this, Index.class);
			return theIndex.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing Index for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			Index theIndex = (Index)findAncestorWithClass(this, Index.class);
			theIndex.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing Index for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing Index for subjectURI tag ");
		}
	}
}

