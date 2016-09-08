package edu.uiowa.slis.BIBFRAME.MatrixNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MatrixNumberIdentifiesType extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MatrixNumberIdentifiesType currentInstance = null;
	private static final Log log = LogFactory.getLog(MatrixNumberIdentifiesType.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MatrixNumberIdentifiesIterator theMatrixNumberIdentifiesIterator = (MatrixNumberIdentifiesIterator)findAncestorWithClass(this, MatrixNumberIdentifiesIterator.class);
			pageContext.getOut().print(theMatrixNumberIdentifiesIterator.getType());
		} catch (Exception e) {
			log.error("Can't find enclosing MatrixNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

