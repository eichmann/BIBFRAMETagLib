package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasOriginPlaceType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasOriginPlaceType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasOriginPlaceType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasOriginPlaceIterator theMagazineHasOriginPlaceIterator = (MagazineHasOriginPlaceIterator)findAncestorWithClass(this, MagazineHasOriginPlaceIterator.class);
			pageContext.getOut().print(theMagazineHasOriginPlaceIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasOriginPlace tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasOriginPlace tag ");
		}
		return SKIP_BODY;
	}
}

