package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineDerivedFrom extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineDerivedFrom currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineDerivedFrom.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineDerivedFromIterator theMagazineDerivedFromIterator = (MagazineDerivedFromIterator)findAncestorWithClass(this, MagazineDerivedFromIterator.class);
			pageContext.getOut().print(theMagazineDerivedFromIterator.getDerivedFrom());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for derivedFrom tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for derivedFrom tag ");
		}
		return SKIP_BODY;
	}
}

