package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasLast extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasLast currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasLast.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasLastIterator theMagazineHasLastIterator = (MagazineHasLastIterator)findAncestorWithClass(this, MagazineHasLastIterator.class);
			pageContext.getOut().print(theMagazineHasLastIterator.getHasLast());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasLast tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasLast tag ");
		}
		return SKIP_BODY;
	}
}

