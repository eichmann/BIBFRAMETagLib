package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazinePrecedes extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazinePrecedes currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazinePrecedes.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazinePrecedesIterator theMagazinePrecedesIterator = (MagazinePrecedesIterator)findAncestorWithClass(this, MagazinePrecedesIterator.class);
			pageContext.getOut().print(theMagazinePrecedesIterator.getPrecedes());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for precedes tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for precedes tag ");
		}
		return SKIP_BODY;
	}
}

