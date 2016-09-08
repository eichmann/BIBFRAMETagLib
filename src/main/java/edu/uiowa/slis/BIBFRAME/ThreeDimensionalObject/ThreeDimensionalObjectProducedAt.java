package edu.uiowa.slis.BIBFRAME.ThreeDimensionalObject;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class ThreeDimensionalObjectProducedAt extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static ThreeDimensionalObjectProducedAt currentInstance = null;
	private static final Log log = LogFactory.getLog(ThreeDimensionalObjectProducedAt.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			ThreeDimensionalObjectProducedAtIterator theThreeDimensionalObjectProducedAtIterator = (ThreeDimensionalObjectProducedAtIterator)findAncestorWithClass(this, ThreeDimensionalObjectProducedAtIterator.class);
			pageContext.getOut().print(theThreeDimensionalObjectProducedAtIterator.getProducedAt());
		} catch (Exception e) {
			log.error("Can't find enclosing ThreeDimensionalObject for producedAt tag ", e);
			throw new JspTagException("Error: Can't find enclosing ThreeDimensionalObject for producedAt tag ");
		}
		return SKIP_BODY;
	}
}

