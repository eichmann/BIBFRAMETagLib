package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineProducedAtType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineProducedAtType currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineProducedAtType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineProducedAtIterator theMagazineProducedAtIterator = (MagazineProducedAtIterator)findAncestorWithClass(this, MagazineProducedAtIterator.class);
			pageContext.getOut().print(theMagazineProducedAtIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

