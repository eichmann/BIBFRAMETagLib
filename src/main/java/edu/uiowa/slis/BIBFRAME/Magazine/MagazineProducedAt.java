package edu.uiowa.slis.BIBFRAME.Magazine;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MagazineProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MagazineProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(MagazineProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MagazineProducedAtIterator theMagazineProducedAtIterator = (MagazineProducedAtIterator)findAncestorWithClass(this, MagazineProducedAtIterator.class);
			pageContext.getOut().print(theMagazineProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing Magazine for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing Magazine for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

