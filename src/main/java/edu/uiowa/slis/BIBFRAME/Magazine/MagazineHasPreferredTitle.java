package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasPreferredTitle extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasPreferredTitle currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasPreferredTitle.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasPreferredTitleIterator theMagazineHasPreferredTitleIterator = (MagazineHasPreferredTitleIterator)findAncestorWithClass(this, MagazineHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMagazineHasPreferredTitleIterator.getHasPreferredTitle());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

