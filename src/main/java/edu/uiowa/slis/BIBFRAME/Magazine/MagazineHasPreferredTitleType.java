package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasPreferredTitleType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasPreferredTitleType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasPreferredTitleType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasPreferredTitleIterator theMagazineHasPreferredTitleIterator = (MagazineHasPreferredTitleIterator)findAncestorWithClass(this, MagazineHasPreferredTitleIterator.class);
			pageContext.getOut().print(theMagazineHasPreferredTitleIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasPreferredTitle tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasPreferredTitle tag ");
		}
		return SKIP_BODY;
	}
}

