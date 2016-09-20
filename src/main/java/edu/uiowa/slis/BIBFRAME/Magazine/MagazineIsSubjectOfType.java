package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIsSubjectOfType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIsSubjectOfType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIsSubjectOfType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIsSubjectOfIterator theMagazineIsSubjectOfIterator = (MagazineIsSubjectOfIterator)findAncestorWithClass(this, MagazineIsSubjectOfIterator.class);
			pageContext.getOut().print(theMagazineIsSubjectOfIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for isSubjectOf tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for isSubjectOf tag ");
		}
		return SKIP_BODY;
	}
}

