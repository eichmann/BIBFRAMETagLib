package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazinePrecedesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazinePrecedesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazinePrecedesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazinePrecedesIterator theMagazinePrecedesIterator = (MagazinePrecedesIterator)findAncestorWithClass(this, MagazinePrecedesIterator.class);
			pageContext.getOut().print(theMagazinePrecedesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for precedes tag ");
		}
		return SKIP_BODY;
	}
}

