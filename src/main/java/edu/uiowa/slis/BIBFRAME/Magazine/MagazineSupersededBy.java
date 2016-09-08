package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSupersededBy extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSupersededBy currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSupersededBy.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSupersededByIterator theMagazineSupersededByIterator = (MagazineSupersededByIterator)findAncestorWithClass(this, MagazineSupersededByIterator.class);
			pageContext.getOut().print(theMagazineSupersededByIterator.getSupersededBy());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for supersededBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for supersededBy tag ");
		}
		return SKIP_BODY;
	}
}

