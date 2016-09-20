package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSubject extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSubject currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSubject.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSubjectIterator theMagazineSubjectIterator = (MagazineSubjectIterator)findAncestorWithClass(this, MagazineSubjectIterator.class);
			pageContext.getOut().print(theMagazineSubjectIterator.getSubject());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for subject tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for subject tag ");
		}
		return SKIP_BODY;
	}
}

