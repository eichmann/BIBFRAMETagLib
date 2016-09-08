package edu.uiowa.slis.BIBFRAME.BinderTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class BinderTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static BinderTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(BinderTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			BinderTitle theBinderTitle = (BinderTitle)findAncestorWithClass(this, BinderTitle.class);
			if (!theBinderTitle.commitNeeded) {
				pageContext.getOut().print(theBinderTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			BinderTitle theBinderTitle = (BinderTitle)findAncestorWithClass(this, BinderTitle.class);
			return theBinderTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing BinderTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			BinderTitle theBinderTitle = (BinderTitle)findAncestorWithClass(this, BinderTitle.class);
			theBinderTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing BinderTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing BinderTitle for subjectURI tag ");
		}
	}
}

