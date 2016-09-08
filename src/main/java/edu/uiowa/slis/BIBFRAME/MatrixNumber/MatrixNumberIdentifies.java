package edu.uiowa.slis.BIBFRAME.MatrixNumber;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspTagException;

@SuppressWarnings("serial")
public class MatrixNumberIdentifies extends edu.uiowa.slis.BIBFRAME.TagLibSupport {
	static MatrixNumberIdentifies currentInstance = null;
	private static final Log log = LogFactory.getLog(MatrixNumberIdentifies.class);

	// object property

	public int doStartTag() throws JspException {
		try {
			MatrixNumberIdentifiesIterator theMatrixNumberIdentifiesIterator = (MatrixNumberIdentifiesIterator)findAncestorWithClass(this, MatrixNumberIdentifiesIterator.class);
			pageContext.getOut().print(theMatrixNumberIdentifiesIterator.getIdentifies());
		} catch (Exception e) {
			log.error("Can't find enclosing MatrixNumber for identifies tag ", e);
			throw new JspTagException("Error: Can't find enclosing MatrixNumber for identifies tag ");
		}
		return SKIP_BODY;
	}
}

