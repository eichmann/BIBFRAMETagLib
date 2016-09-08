package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineAbsorbedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineAbsorbedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineAbsorbedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineAbsorbedByIterator theMagazineAbsorbedByIterator = (MagazineAbsorbedByIterator)findAncestorWithClass(this, MagazineAbsorbedByIterator.class);
			pageContext.getOut().print(theMagazineAbsorbedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for absorbedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for absorbedBy tag ");
		}
		return SKIP_BODY;
	}
}

