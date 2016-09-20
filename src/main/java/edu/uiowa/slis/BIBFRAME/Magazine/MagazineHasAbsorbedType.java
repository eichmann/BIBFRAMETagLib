package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineHasAbsorbedType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineHasAbsorbedType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineHasAbsorbedType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineHasAbsorbedIterator theMagazineHasAbsorbedIterator = (MagazineHasAbsorbedIterator)findAncestorWithClass(this, MagazineHasAbsorbedIterator.class);
			pageContext.getOut().print(theMagazineHasAbsorbedIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for hasAbsorbed tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for hasAbsorbed tag ");
		}
		return SKIP_BODY;
	}
}

