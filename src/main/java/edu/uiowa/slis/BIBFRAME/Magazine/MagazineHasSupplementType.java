package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasSupplementType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasSupplementType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasSupplementType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasSupplementIterator theMagazineHasSupplementIterator = (MagazineHasSupplementIterator)findAncestorWithClass(this, MagazineHasSupplementIterator.class);
			pageContext.getOut().print(theMagazineHasSupplementIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasSupplement tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasSupplement tag ");
		}
		return SKIP_BODY;
	}
}

