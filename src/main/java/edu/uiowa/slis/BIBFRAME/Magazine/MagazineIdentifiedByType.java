package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineIdentifiedByType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineIdentifiedByType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineIdentifiedByType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineIdentifiedByIterator theMagazineIdentifiedByIterator = (MagazineIdentifiedByIterator)findAncestorWithClass(this, MagazineIdentifiedByIterator.class);
			pageContext.getOut().print(theMagazineIdentifiedByIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for identifiedBy tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for identifiedBy tag ");
		}
		return SKIP_BODY;
	}
}

