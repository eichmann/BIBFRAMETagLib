package edu.uiowa.slis.BIBFRAME.SpineTitle;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class SpineTitleSubjectURI extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static SpineTitleSubjectURI currentInstance = null;
	private static final Log log = LogFactory.getLog(SpineTitleSubjectURI.class);

	// functional property

	public int doStartTag() throws JspException {
		try {
			SpineTitle theSpineTitle = (SpineTitle)findAncestorWithClass(this, SpineTitle.class);
			if (!theSpineTitle.commitNeeded) {
				pageContext.getOut().print(theSpineTitle.getSubjectURI());
			}
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for subjectURI tag ");
		}
		return SKIP_BODY;
	}

	public String getSubjectURI() throws JspTagException {
		try {
			SpineTitle theSpineTitle = (SpineTitle)findAncestorWithClass(this, SpineTitle.class);
			return theSpineTitle.getSubjectURI();
		} catch (Exception e) {
			log.error(" Can't find enclosing SpineTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for subjectURI tag ");
		}
	}

	public void setSubjectURI(String subjectURI) throws JspTagException {
		try {
			SpineTitle theSpineTitle = (SpineTitle)findAncestorWithClass(this, SpineTitle.class);
			theSpineTitle.setSubjectURI(subjectURI);
		} catch (Exception e) {
			log.error("Can't find enclosing SpineTitle for subjectURI tag ", e);
			throw new JspTagException("Error: Can't find enclosing SpineTitle for subjectURI tag ");
		}
	}
}

