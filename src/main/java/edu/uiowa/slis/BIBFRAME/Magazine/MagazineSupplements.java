package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineSupplements extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineSupplements currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineSupplements.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineSupplementsIterator theMagazineSupplementsIterator = (MagazineSupplementsIterator)findAncestorWithClass(this, MagazineSupplementsIterator.class);
			pageContext.getOut().print(theMagazineSupplementsIterator.getSupplements());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for supplements tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for supplements tag ");
		}
		return SKIP_BODY;
	}
}

