package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasPart extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasPart currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasPart.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasPartIterator theMagazineHasPartIterator = (MagazineHasPartIterator)findAncestorWithClass(this, MagazineHasPartIterator.class);
			pageContext.getOut().print(theMagazineHasPartIterator.getHasPart());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasPart tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasPart tag ");
		}
		return SKIP_BODY;
	}
}

