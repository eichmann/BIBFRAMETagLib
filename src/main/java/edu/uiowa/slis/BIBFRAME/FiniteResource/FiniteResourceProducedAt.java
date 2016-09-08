package edu.uiowa.slis.BIBFRAME.FiniteResource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class FiniteResourceProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static FiniteResourceProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(FiniteResourceProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			FiniteResourceProducedAtIterator theFiniteResourceProducedAtIterator = (FiniteResourceProducedAtIterator)findAncestorWithClass(this, FiniteResourceProducedAtIterator.class);
			pageContext.getOut().print(theFiniteResourceProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing FiniteResource for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing FiniteResource for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

